package com.mullatoez.componentnavigation

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import java.math.BigDecimal

@VersionedParcelize
data class Money (val amount: BigDecimal) : Parcelable {
}