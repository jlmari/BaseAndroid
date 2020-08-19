package com.jlmari.apidatasource.mappers

import com.jlmari.apidatasource.models.UserApiModel
import com.jlmari.domain.models.UserModel
import com.jlmari.domain.utils.Mapper
import javax.inject.Inject


class UserInMapper @Inject constructor() : Mapper<UserModel, UserApiModel> {

    override fun map(from: UserModel): UserApiModel =
        UserApiModel(from.email, from.password)
}
