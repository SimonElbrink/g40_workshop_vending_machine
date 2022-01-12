package se.lexicon.model;

public enum SWEDISH_DENOMINATION {

    SEK_1(1.00,"ENKRONA"),
    SEK_2(2.00,"TVÅKRONOR"),
    SEK_5(5.00,"FEMKRONOR"),
    SEK_10(10.00,"TIOKRONOR"),
    SEK_20(20.00,"TJUGOKRONOR"),
    SEK_50(50.00,"FEMTIOKRONOR"),
    SEK_100(100.00,"ETTHUNDRAKRONOR"),
    SEK_200(200.00,"TVÅHUNDRAKRONOR"),
    SEK_500(500.00,"FEHUNDRAKRONOR"),
    SEK_1000(1000.00,"ETTUSENKRONOR");

    private final double VALUE;
    private final String NAMED;

    SWEDISH_DENOMINATION(double value, String name) {
        this.VALUE = value;
        this.NAMED = name;
    }

    public double getVALUE() {
        return VALUE;
    }

    public String getNAMED() {
        return NAMED;
    }
}
