package com.varanasisoftwarejunction.quizapp

class QuestionSupplier {
    companion object
    {
        fun GetQuestions():Array<Question>
        {
            var q0:Question
           var q1:Question
           var q2:Question
           var q3:Question
           q0= Question("What is the capital of UP","Hukulganj","Lucknow","Tarun","Arbaz",2)
            q1=Question("What is the capital of Bihar","Patna","Lucknow","Tarun","Arbaz",1)
            q2=Question("What is the capital of Madhya Pradesh","Hukulganj","Lucknow","Bhopal","Arbaz",3)
            q3=Question("What is the capital of Maharashtra","Hukulganj","Lucknow","Tarun","Mumbai",4)
           var questions:Array<Question>
           questions= arrayOf<Question>(q0,q1,q2,q3)
            return questions


        }
    }


}