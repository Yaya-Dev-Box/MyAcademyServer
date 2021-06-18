package db.repos

import db.constants.DBConstants
import kodein
import models.History
import org.bson.types.ObjectId
import org.kodein.di.generic.instance
import org.litote.kmongo.coroutine.CoroutineDatabase

class HistoryRepo {

    private val db: CoroutineDatabase by kodein.instance()
    private val col = db.getCollection<History>(DBConstants.HISTORY_COL_NAME)

    suspend fun getAllHistories() = col.find().toList()

    suspend fun getHistory(id: String) = col.findOneById(ObjectId(id))

    suspend fun addHistory(history: History) = col.insertOne(history)

}