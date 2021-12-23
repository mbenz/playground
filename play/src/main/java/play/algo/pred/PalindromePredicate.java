package play.algo.pred;

import kotlin.NotImplementedError;

import java.util.function.Predicate;

class PalindromePredicate implements Predicate<String> {

    @Override
    public boolean test(String s) {
        throw new NotImplementedError("Return whether s is palindrome");
        //return false;
    }
}
