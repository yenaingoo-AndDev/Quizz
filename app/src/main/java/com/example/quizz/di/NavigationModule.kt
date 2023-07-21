package com.example.quizz.di

import com.example.home.HomeNavigation
import com.example.question.QuestionNavigation
import com.example.quizz.navigation.HomeNavigationImpl
import com.example.quizz.navigation.QuestionNavigationImpl
import com.example.quizz.navigation.ResultNavigationImpl
import com.example.result.ResultNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NavigationModule {

    @Binds
    @Singleton
    abstract fun bindHomeNavigation(impl: HomeNavigationImpl) : HomeNavigation

    @Binds
    @Singleton
    abstract fun bindQuestionNavigation(impl: QuestionNavigationImpl) : QuestionNavigation

    @Binds
    @Singleton
    abstract fun bindResultNavigation(impl: ResultNavigationImpl) : ResultNavigation

}