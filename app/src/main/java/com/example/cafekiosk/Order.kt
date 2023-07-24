package com.example.cafekiosk

data class DetailMenuName(
    var name: String,
    var charge: Int
)

fun main() {

    println("안녕하세요? 투썸플레이스입니다.\n")
    Order().firstOrder()

}

lateinit var method: String
lateinit var detailMenu: String

class Order {

    fun firstOrder() {


        while (true) {
            try {
                println("주문을 하시려면 1번을 눌러주세요.\n" +
                        "1. 주문하기\n" +
                        "2. 프로그램 종료.")
                val orderNum = readLine()?.toInt()

                when (orderNum) {
                    1 -> {
                        UseCafe().useMethodChoice()
                        break
                    }

                    2 -> {
                        println("프로그램 종료")
                        System.exit(0)
                    }

                    else -> println("올바르지 않은 번호입니다. 다시 입력해주세요. \n----------------------------------\n")

                }
            } catch (e: java.lang.NumberFormatException) {
                println("메뉴 주문은 숫자만 입력할 수 있습니다. \n----------------------------------\n")
            }
        }

    }
}

class UseCafe() {
    fun useMethodChoice() {

        while (true) {

            println(
                "매장 이용 방법을 선택해주세요\n" +
                        "1. 매장식사\n" +
                        "2. 포장하기\n" +
                        "3. 프로그램종료"
            )

            try {
                val useMethod = readLine()?.toInt()

                when (useMethod) {
                    1 -> {
                        method = "매장식사"
                        MainMenu().mainMenuList()
                        break
                    }

                    2 -> {
                        method = "포장하기"
                        MainMenu().mainMenuList()
                        break
                    }

                    3 -> {
                        println("프로그램 종료")
                        System.exit(0)
                    }

                    else -> println("올바르지 않은 번호입니다. 다시 입력해주세요. \n----------------------------------\n")

                }
            } catch (e: java.lang.NumberFormatException) {
                println("메뉴 주문은 숫자만 입력할 수 있습니다. \n----------------------------------\n")
            }
        }
    }
}

class MainMenu() {

    fun mainMenuList() {
        while (true) {

            println(
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요\n" +
                        "1. Coffee\n" +
                        "2. Non-Coffee\n" +
                        "3. Ade\n" +
                        "4. Smoothie\n" +
                        "5. Tea\n" +
                        "6. Dessert\n" +
                        "7. 프로그램 종료"
            )

            try {
                val menu = readLine()?.toInt()

                when (menu) {
                    1 -> listOf(DetailMenuName("아메리카노", 3000), )

                    else -> println("올바르지 않은 번호입니다. 다시 입력해주세요. \n----------------------------------\n")

                }
            } catch (e: java.lang.NumberFormatException) {
                println("메뉴 주문은 숫자만 입력할 수 있습니다. \n----------------------------------\n")
            }
        }
    }
}