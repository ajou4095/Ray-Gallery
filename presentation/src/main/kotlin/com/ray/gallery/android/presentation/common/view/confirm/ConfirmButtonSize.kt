package com.ray.gallery.android.presentation.common.view.confirm

sealed interface ConfirmButtonSize {
    data object Xlarge : ConfirmButtonSize
    data object Large : ConfirmButtonSize
    data object Medium : ConfirmButtonSize
    data object Small : ConfirmButtonSize
}
