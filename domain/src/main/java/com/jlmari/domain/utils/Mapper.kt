package com.jlmari.domain.utils

/**
 * Interface to map one [Object] to another.
 */
interface Mapper<in FROM, out TO> {

    fun map(from: FROM): TO
}
