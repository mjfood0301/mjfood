package com.lee989898.todayeat.src.detail.model

data class ResponseReview(
    val isSuccess: Boolean,
    val code: Int,
    val message: List<String>,
    val result: String
)
