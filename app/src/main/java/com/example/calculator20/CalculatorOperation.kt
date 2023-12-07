package com.example.calculator20

import java.text.DateFormatSymbols

sealed class CalculatorOperation(val symbols: String){
    object Add: CalculatorOperation("+")
    object Subtracy: CalculatorOperation("-")
    object Multiply: CalculatorOperation("*")
    object Divide: CalculatorOperation("/")

}
