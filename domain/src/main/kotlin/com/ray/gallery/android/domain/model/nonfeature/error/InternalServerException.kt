package com.ray.gallery.android.domain.model.nonfeature.error

class InternalServerException(
    override val id: String,
    override val message: String
) : ServerException(id, message)
