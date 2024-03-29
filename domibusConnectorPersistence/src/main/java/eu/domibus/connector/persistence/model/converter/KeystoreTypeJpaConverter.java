package eu.domibus.connector.persistence.model.converter;

import eu.domibus.connector.domain.model.DomibusConnectorKeystore.KeystoreType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Converter(autoApply = true)
public class KeystoreTypeJpaConverter implements AttributeConverter<KeystoreType, String> {
    @Override
    public String convertToDatabaseColumn(KeystoreType attribute) {
        return attribute.getDbName();
    }

    @Override
    public KeystoreType convertToEntityAttribute(String dbData) {
        return KeystoreType.ofDbName(dbData);
    }
}
