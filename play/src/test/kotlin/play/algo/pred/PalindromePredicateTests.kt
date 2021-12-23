package play.algo.pred

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class PalindromePredicateTests {

    private val palindromePredicate = PalindromePredicate()

    @Test
    fun testThatEmptyStringIsPalindrome() {
        assertTrue(palindromePredicate.test(""))
    }

    @Test
    fun testThatSingleCharacterIsPalindrome() {
        assertTrue(palindromePredicate.test("a"))
    }

    @Test
    fun testValidPalindromes() {
        listOf(
            // https://en.wikipedia.org/wiki/Palindrome
            "abba", "neveroddoreven", "able was I ere I saw elba", "racecar",
            "madam", "11/11/11", "ΝΙΨΟΝ ΑΝΟΜΗΜΑΤΑ ΜΗ ΜΟΝΑΝ ΟΨΙΝ",
            "dogmaiamgod", "mrowlatemymetalworm", "dogeeseseegod",
            "wasitacaroracatisaw", "murderforajarofredrum",
            "gohangasalamiimalasagnahog", "rats live on no evil star",
            "live on time emit no evil", "step on no pets",
            "hannah", "ava", "aviva", "anna", "eve", "bob", "otto",
            "harrah", "renner", "salas", "nenonen")
            .map { { assertTrue(palindromePredicate.test(it), it) } }
            .let { assertAll(it) }
    }

    @Test
    fun testInvalidPalindromes() {
        listOf("not me", "ab", "112")
            .map { { assertFalse(palindromePredicate.test(it), it) } }
            .let { assertAll(it) }
    }
}
