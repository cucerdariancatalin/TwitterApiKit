package com.mcdev.twitterapikit.field

/**
 * List of fields from the List object you want to return from your request.*/
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
    OWNER_ID("owner_id"),

    /**All default fields*/
    DEFAULT("${ID.value},${NAME.value}"),

    /**All fields*/
    ALL("${ID.value}," +
            "${NAME.value}," +
            "${CREATED_AT.value}," +
            "${FOLLOWER_COUNT.value}," +
            "${MEMBER_COUNT.value}," +
            "${PRIVATE.value}," +
            "${DESCRIPTION.value}," +
            OWNER_ID.value
    )
}