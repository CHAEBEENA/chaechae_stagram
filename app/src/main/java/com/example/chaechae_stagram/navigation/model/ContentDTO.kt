package com.example.chaechae_stagram.navigation.model

data class ContentDTO(
    var explain : String ?= null,
    var imageUrl : String ?= null,
    var uid : String ?= null,
    var userId: String? = null,
    var timestamp : Long ?= null,
    var favoriteCount : Int = 0,
    //중복 좋아요 방지하기 위한 좋아요누른 유저 관리
    var favorites : MutableMap<String,Boolean> = HashMap()) {
    data class Comment(var uid : String? = null,
                       var userId : String? = null,
                       var comment : String? = null,
                       var timestamp: Long? = null)
}