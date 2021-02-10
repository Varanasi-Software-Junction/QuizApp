package com.varanasisoftwarejunction.quizapp

class Question {
    var question:String=""
    var opta:String=""
    var optb:String=""
    var optc:String=""
    var optd:String=""
    var correctanswer:Int=0
    var givenanswer:Int=0
    constructor(question:String,opta:String,optb:String,optc:String,optd:String,correctanswer:Int)
    {
        this.question=question
        this.opta=opta
        this.optb=optb
        this.optc=optc
        this.optd=optd
        this.correctanswer=correctanswer

    }
}