package com.prince.betfair.betfair.accounts

data class DeveloperAppVersion(
    val owner: String,
    val versionId: Long,
    val version: String,
    val applicationKey: String,
    val delayData: Boolean,
    val subscriptionRequired: Boolean,
    val ownerManaged: Boolean,
    val active: Boolean,
    val vendorId: String,
    val vendorSecret: String
)
