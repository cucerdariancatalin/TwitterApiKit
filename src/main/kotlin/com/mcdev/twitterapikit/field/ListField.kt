package com.mcdev.twitterapikit.field

enum class ListField(val value: String) {
    /*default values*/
    ID("id"),
    NAME("name"),

    /*Allowed values*/
    CREATED_AT("created_at"),
    FOLLOWER_COUNT("follower_count"),
    MEMBER_COUNT("member_count"),
    PRIVATE("private"),
    DESCRIPTION("description"),
    OWNER_ID("owner_id")
}