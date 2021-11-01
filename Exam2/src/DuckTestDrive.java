public class DuckTestDrive {
    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck ();

        WildTurkey wildTurkey = new WildTurkey ();
        Duck turkeyAdapter = new TurkeyAdapter (wildTurkey);

        System.out.println ("The Turkey Says...");
        wildTurkey.gobble ();
        wildTurkey.fly ();

        System.out.println ("\nThe Duck Says...");
        testDuck (mallarDuck);

        System.out.println ("\nThe TurkeyAdapter Syas...");
        testDuck (turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack ();
        duck.fly ();
    }
}
