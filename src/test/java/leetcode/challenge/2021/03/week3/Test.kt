package leetcode.challenge.`2021`.`03`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun maxProfitTest() {
        Assert.assertEquals(8, maxProfit(intArrayOf(1, 3, 2, 8, 4, 9), 2))
        Assert.assertEquals(6, maxProfit(intArrayOf(1, 3, 7, 5, 10, 3), 3))
    }

    @Test
    fun wiggleMaxLengthTest() {
        Assert.assertEquals(6, wiggleMaxLength(intArrayOf(1, 7, 4, 9, 2, 5)))
        Assert.assertEquals(7, wiggleMaxLength(intArrayOf(1, 17, 5, 10, 13, 15, 10, 5, 16, 8)))
        Assert.assertEquals(2, wiggleMaxLength(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    }

    @Test
    fun canVisitAllRoomsTest() {
        Assert.assertTrue(canVisitAllRooms(listOf(listOf(1), listOf(2), listOf(3), listOf())))
        Assert.assertFalse(canVisitAllRooms(listOf(listOf(1, 3), listOf(3, 0, 1), listOf(2), listOf(0))))
    }

    @Test
    fun testUndergroundSystem() {
        let {
            val undergroundSystem = UndergroundSystem()
            undergroundSystem.checkIn(45, "Leyton", 3)
            undergroundSystem.checkIn(32, "Paradise", 8)
            undergroundSystem.checkIn(27, "Leyton", 10)
            undergroundSystem.checkOut(45, "Waterloo", 15)
            undergroundSystem.checkOut(27, "Waterloo", 20)
            undergroundSystem.checkOut(32, "Cambridge", 22)
            undergroundSystem.getAverageTime(
                "Paradise",
                "Cambridge"
            ) // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)

            undergroundSystem.getAverageTime(
                "Leyton",
                "Waterloo"
            ) // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000

            undergroundSystem.checkIn(10, "Leyton", 24)
            undergroundSystem.getAverageTime("Leyton", "Waterloo") // return 11.00000

            undergroundSystem.checkOut(10, "Waterloo", 38)
            undergroundSystem.getAverageTime("Leyton", "Waterloo") // return 12.00000
        }

        let {
            val undergroundSystem = UndergroundSystem()
            undergroundSystem.checkIn(10, "Leyton", 3)
            undergroundSystem.checkOut(10, "Paradise", 8)
            undergroundSystem.getAverageTime("Leyton", "Paradise") // return 5.00000

            undergroundSystem.checkIn(5, "Leyton", 10)
            undergroundSystem.checkOut(5, "Paradise", 16)
            undergroundSystem.getAverageTime("Leyton", "Paradise") // return 5.50000

            undergroundSystem.checkIn(2, "Leyton", 21)
            undergroundSystem.checkOut(2, "Paradise", 30)
            undergroundSystem.getAverageTime("Leyton", "Paradise") // return 6.66667
        }
    }
}