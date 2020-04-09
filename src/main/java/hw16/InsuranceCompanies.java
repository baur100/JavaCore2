package hw16;

import java.util.stream.Stream;

public enum InsuranceCompanies {
    UnitedHealth("Accepted"),
    Anthem("Accepted"),
    Kaiser("Accepted"),
    CenteneCorp("Unaccepted"),
    HCSC("Unaccepted");

    private String status;

    InsuranceCompanies(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static Stream<InsuranceCompanies> stream() {
        return Stream.of(InsuranceCompanies.values());
    }
}
