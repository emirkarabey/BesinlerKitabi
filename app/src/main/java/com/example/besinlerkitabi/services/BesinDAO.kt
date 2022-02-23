package com.example.besinlerkitabi.services

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.besinlerkitabi.model.Besin
@Dao
interface BesinDAO {

    @Insert
    suspend fun insertAll(vararg besin :Besin):List<Long>

    @Query("SELECT * FROM besin")
    suspend fun getAllbesin():List<Besin>

    @Query("SELECT * FROM besin WHERE uuid=:besinId")
    suspend fun getBesin(besinId:Int):Besin

    @Query("DELETE FROM besin")
    suspend fun deleteAllBesin()
}