package eu.domibus.connector.domain.enums;

import javax.annotation.Nullable;
import java.util.stream.Stream;


public enum MessageTargetSource {
    GATEWAY("GATEWAY"),
    BACKEND("BACKEND");

    /**
     * This name is used within the database
     */
    private String dbName;

    MessageTargetSource(String dbName) {
        this.dbName = dbName;
    }

    /**
     * @param dbData - the dbString
     * @return the converterd value from the String value,
     * null if the input is null
     */
    public static @Nullable MessageTargetSource ofOfDbName(String dbData) {
        if (dbData == null) {
            return null;
        }
        return Stream.of(MessageTargetSource.values())
                     .filter(t -> t.getDbName().equals(dbData))
                     .findFirst()
                     .orElse(null);
    }


    public String getDbName() {
        return dbName;
    }
}
