package meclient.apiclient.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties of a macOS .app in the package
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSLobChildApp implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new MacOSLobChildApp and sets the default values.
     */
    public MacOSLobChildApp() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSLobChildApp
     */
    @jakarta.annotation.Nonnull
    public static MacOSLobChildApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSLobChildApp();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the buildNumber property value. The build number of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBuildNumber() {
        return this.backingStore.get("buildNumber");
    }
    /**
     * Gets the bundleId property value. The bundleId of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.backingStore.get("bundleId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("buildNumber", (n) -> { this.setBuildNumber(n.getStringValue()); });
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("versionNumber", (n) -> { this.setVersionNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the versionNumber property value. The version number of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersionNumber() {
        return this.backingStore.get("versionNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("buildNumber", this.getBuildNumber());
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("versionNumber", this.getVersionNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the buildNumber property value. The build number of the app.
     * @param value Value to set for the buildNumber property.
     */
    public void setBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("buildNumber", value);
    }
    /**
     * Sets the bundleId property value. The bundleId of the app.
     * @param value Value to set for the bundleId property.
     */
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bundleId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the versionNumber property value. The version number of the app.
     * @param value Value to set for the versionNumber property.
     */
    public void setVersionNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionNumber", value);
    }
}
