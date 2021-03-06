package models

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import org.litote.kmongo.Id
import utils.Serializers
import utils.sealed.RankType

@Serializable
data class User(
    val _id: @Contextual Id<User>? = null,
    val name: String? = null,
    @Serializable(with = Serializers.RankTypeSerializer::class)
    val rank: RankType? = null,
    val loggedIn: Boolean? = false,
) : Entity
