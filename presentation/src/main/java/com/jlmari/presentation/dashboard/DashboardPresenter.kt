package com.jlmari.presentation.dashboard

import com.jlmari.domain.dispatchers.AppDispatchers
import com.jlmari.domain.usecases.GetTokenUseCase
import com.jlmari.domain.usecases.LogoutUseCase
import com.jlmari.domain.utils.either
import com.jlmari.presentation.base.BasePresenter
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

class DashboardPresenter @Inject constructor(
    appDispatchers: AppDispatchers,
    private val getTokenUseCase: GetTokenUseCase,
    private val logoutUseCase: LogoutUseCase
) : BasePresenter<DashboardContract.View, DashboardContract.Router>(), DashboardContract.Presenter {

    private val errorHandler: CoroutineExceptionHandler by lazy { CoroutineExceptionHandler { _, e -> e.printStackTrace() } }
    private val scope: CoroutineScope by lazy { CoroutineScope(appDispatchers.main + SupervisorJob() + errorHandler) }

    private var token: String = ""

    override fun onCreate() {
        super.onCreate()
        token = getTokenUseCase.execute()
        viewAction { showToken(token) }
    }

    override fun onLogoutButtonClicked() {
        scope.launch {
            viewAction { showProgress() }
            val request = logoutUseCase.execute()
            request.either(
                onSuccess = {
                    viewAction { hideProgress() }
                    routerAction { navigateToLogin() }
                }, onFailure = {
                    viewAction { hideProgress() }
                    routerAction { navigateToLogin() }
                }
            )
        }
    }
}
