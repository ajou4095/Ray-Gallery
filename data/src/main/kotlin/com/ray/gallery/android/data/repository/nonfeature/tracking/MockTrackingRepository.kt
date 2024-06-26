package com.ray.gallery.android.data.repository.nonfeature.tracking

import androidx.annotation.Size
import com.ray.gallery.android.domain.model.nonfeature.user.Profile
import com.ray.gallery.android.domain.repository.nonfeature.TrackingRepository
import javax.inject.Inject

class MockTrackingRepository @Inject constructor() : TrackingRepository {

    override suspend fun setProfile(
        profile: Profile
    ): Result<Unit> {
        return Result.success(Unit)
    }

    override suspend fun logEvent(
        @Size(min = 1, max = 40) eventName: String,
        params: Map<String, Any>
    ): Result<Unit> {
        return if (
            params.values.any {
                it !is String && it !is Int && it !is Long && it !is Float && it !is Double && it !is Boolean
            }
        ) {
            Result.failure(IllegalArgumentException("Invalid value type"))
        } else {
            Result.success(Unit)
        }
    }
}
