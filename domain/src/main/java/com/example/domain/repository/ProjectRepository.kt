package com.example.domain.repository

import com.example.domain.model.Project
import io.reactivex.Completable
import io.reactivex.Observable

/*
    this repo allows implement the logic to provide use-cases
    to data layer to access to this data
 */
interface ProjectRepository {

    fun getProject(): Observable<List<Project>>

    fun bookmarkProject(projectId: String): Completable

    fun unbookmarkProject(projectId: String): Completable

    fun getBookmarkedProjects(): Observable<List<Project>>

}