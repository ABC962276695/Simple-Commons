package com.simplemobiletools.commons.interfaces

import androidx.biometric.auth.AuthPromptHost
import com.simplemobiletools.commons.views.MyScrollView

interface SecurityTab {
    fun initTab(requiredHash: String, listener: HashListener, scrollView: MyScrollView, biometricPromptHost: AuthPromptHost, isSettingUpNewProtection: Boolean)

    fun visibilityChanged(isVisible: Boolean)
}
