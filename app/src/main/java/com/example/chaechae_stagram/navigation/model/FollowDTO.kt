package com.example.chaechae_stagram.navigation.model

data class FollowDTO(
    var followerCount : Int = 0,
    var followers : MutableMap<String,Boolean> = HashMap(), //중복 팔로워 방지하기 위해 맵 사용

    var followingCount : Int = 0,
    var followings : MutableMap<String, Boolean> = HashMap()
)