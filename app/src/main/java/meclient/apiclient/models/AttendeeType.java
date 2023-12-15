package meclient.apiclient.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AttendeeType implements ValuedEnum {
    Required("required"),
    Optional("optional"),
    Resource("resource");
    public final String value;
    AttendeeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttendeeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "required": return Required;
            case "optional": return Optional;
            case "resource": return Resource;
            default: return null;
        }
    }
}
