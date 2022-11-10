package com.example.udemyquizapp

/*
This data class is a model of a question that I can connect to my UI.
 */

data class Question(

    val id: Int,    // Question id

    val question: String,  // Questions

    /*
    Images in android are created based on Ints. This means the Int is a location
    inside of our Resources.
     */
    val image: Int,

    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int

)
