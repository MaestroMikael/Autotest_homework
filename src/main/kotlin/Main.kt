
//package ru.netology
import kotlin.math.max

const val ERROR_CARD = -1
const val ERROR_CARDLIMIT = -2

fun main() {
     println(commissionCalc("VKpay",1000,11000))}
    fun commissionCalc(cardType: String, previousPay: Int, amount: Int): Int {
        return when (cardType) {
            "Maestro", "Mastercard" -> if (previousPay + amount <= 600_000 && amount <= 75_000) {
                ((amount * 0.006) + 20).toInt()
            } else {
                ERROR_CARDLIMIT
            }

            "Visa", "Мир" -> if (previousPay + amount <= 600_000 && amount <= 150_000) {
                max(35, (amount * 0.075).toInt())
            } else {
                ERROR_CARDLIMIT
            }

            "VKpay" -> if (previousPay + amount <= 40000 && amount <= 15000) {
                0
            } else {
                ERROR_CARDLIMIT
            }

            else -> ERROR_CARD
        }
    }
