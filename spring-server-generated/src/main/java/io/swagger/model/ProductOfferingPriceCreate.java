package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BundledProductOfferingPriceRelationship;
import io.swagger.model.ConstraintRef;
import io.swagger.model.Money;
import io.swagger.model.PlaceRef;
import io.swagger.model.PricingLogicAlgorithm;
import io.swagger.model.ProductOfferingPriceRelationship;
import io.swagger.model.ProductOfferingTerm;
import io.swagger.model.ProductSpecificationCharacteristicValueUse;
import io.swagger.model.Quantity;
import io.swagger.model.TaxItem;
import io.swagger.model.TimePeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Is based on both the basic cost to develop and produce products and the enterprises policy on revenue targets. This price may be further revised through discounting (productOfferPriceAlteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected, eg: a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment. Skipped properties: id,href
 */
@Schema(description = "Is based on both the basic cost to develop and produce products and the enterprises policy on revenue targets. This price may be further revised through discounting (productOfferPriceAlteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected, eg: a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment. Skipped properties: id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-02T16:44:00.182303984Z[GMT]")


public class ProductOfferingPriceCreate   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("percentage")
  private Float percentage = null;

  @JsonProperty("priceType")
  private String priceType = null;

  @JsonProperty("recurringChargePeriodLength")
  private Integer recurringChargePeriodLength = null;

  @JsonProperty("recurringChargePeriodType")
  private String recurringChargePeriodType = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("bundledPopRelationship")
  @Valid
  private List<BundledProductOfferingPriceRelationship> bundledPopRelationship = null;

  @JsonProperty("constraint")
  @Valid
  private List<ConstraintRef> constraint = null;

  @JsonProperty("place")
  @Valid
  private List<PlaceRef> place = null;

  @JsonProperty("popRelationship")
  @Valid
  private List<ProductOfferingPriceRelationship> popRelationship = null;

  @JsonProperty("price")
  private Money price = null;

  @JsonProperty("pricingLogicAlgorithm")
  @Valid
  private List<PricingLogicAlgorithm> pricingLogicAlgorithm = null;

  @JsonProperty("prodSpecCharValueUse")
  @Valid
  private List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse = null;

  @JsonProperty("productOfferingTerm")
  @Valid
  private List<ProductOfferingTerm> productOfferingTerm = null;

  @JsonProperty("tax")
  @Valid
  private List<TaxItem> tax = null;

  @JsonProperty("unitOfMeasure")
  private Quantity unitOfMeasure = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public ProductOfferingPriceCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the productOfferingPrice
   * @return description
   **/
  @Schema(description = "Description of the productOfferingPrice")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductOfferingPriceCreate isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * A flag indicating if this ProductOfferingPrice is composite (bundle) or not
   * @return isBundle
   **/
  @Schema(description = "A flag indicating if this ProductOfferingPrice is composite (bundle) or not")
  
    public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ProductOfferingPriceCreate lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * the last update time of this ProductOfferingPrice
   * @return lastUpdate
   **/
  @Schema(description = "the last update time of this ProductOfferingPrice")
  
    @Valid
    public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ProductOfferingPriceCreate lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * the lifecycle status of this ProductOfferingPrice
   * @return lifecycleStatus
   **/
  @Schema(description = "the lifecycle status of this ProductOfferingPrice")
  
    public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public ProductOfferingPriceCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the productOfferingPrice
   * @return name
   **/
  @Schema(required = true, description = "Name of the productOfferingPrice")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOfferingPriceCreate percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage to apply for ProductOfferPriceAlteration (Discount)
   * @return percentage
   **/
  @Schema(description = "Percentage to apply for ProductOfferPriceAlteration (Discount)")
  
    public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public ProductOfferingPriceCreate priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.
   * @return priceType
   **/
  @Schema(description = "A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.")
  
    public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public ProductOfferingPriceCreate recurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
    return this;
  }

  /**
   * the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable
   * @return recurringChargePeriodLength
   **/
  @Schema(description = "the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable")
  
    public Integer getRecurringChargePeriodLength() {
    return recurringChargePeriodLength;
  }

  public void setRecurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
  }

  public ProductOfferingPriceCreate recurringChargePeriodType(String recurringChargePeriodType) {
    this.recurringChargePeriodType = recurringChargePeriodType;
    return this;
  }

  /**
   * The period to repeat the application of the price Could be month, week...
   * @return recurringChargePeriodType
   **/
  @Schema(description = "The period to repeat the application of the price Could be month, week...")
  
    public String getRecurringChargePeriodType() {
    return recurringChargePeriodType;
  }

  public void setRecurringChargePeriodType(String recurringChargePeriodType) {
    this.recurringChargePeriodType = recurringChargePeriodType;
  }

  public ProductOfferingPriceCreate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * ProductOffering version
   * @return version
   **/
  @Schema(description = "ProductOffering version")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProductOfferingPriceCreate bundledPopRelationship(List<BundledProductOfferingPriceRelationship> bundledPopRelationship) {
    this.bundledPopRelationship = bundledPopRelationship;
    return this;
  }

  public ProductOfferingPriceCreate addBundledPopRelationshipItem(BundledProductOfferingPriceRelationship bundledPopRelationshipItem) {
    if (this.bundledPopRelationship == null) {
      this.bundledPopRelationship = new ArrayList<BundledProductOfferingPriceRelationship>();
    }
    this.bundledPopRelationship.add(bundledPopRelationshipItem);
    return this;
  }

  /**
   * this object represents a bundle relationship from a bundle product offering price (parent) to a simple product offering price (child). A simple product offering price may participate in more than one bundle relationship.
   * @return bundledPopRelationship
   **/
  @Schema(description = "this object represents a bundle relationship from a bundle product offering price (parent) to a simple product offering price (child). A simple product offering price may participate in more than one bundle relationship.")
      @Valid
    public List<BundledProductOfferingPriceRelationship> getBundledPopRelationship() {
    return bundledPopRelationship;
  }

  public void setBundledPopRelationship(List<BundledProductOfferingPriceRelationship> bundledPopRelationship) {
    this.bundledPopRelationship = bundledPopRelationship;
  }

  public ProductOfferingPriceCreate constraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
    return this;
  }

  public ProductOfferingPriceCreate addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<ConstraintRef>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

  /**
   * The Constraint resource represents a policy/rule applied to ProductOfferingPrice.
   * @return constraint
   **/
  @Schema(description = "The Constraint resource represents a policy/rule applied to ProductOfferingPrice.")
      @Valid
    public List<ConstraintRef> getConstraint() {
    return constraint;
  }

  public void setConstraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
  }

  public ProductOfferingPriceCreate place(List<PlaceRef> place) {
    this.place = place;
    return this;
  }

  public ProductOfferingPriceCreate addPlaceItem(PlaceRef placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<PlaceRef>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Place defines the places where the products are sold or delivered.
   * @return place
   **/
  @Schema(description = "Place defines the places where the products are sold or delivered.")
      @Valid
    public List<PlaceRef> getPlace() {
    return place;
  }

  public void setPlace(List<PlaceRef> place) {
    this.place = place;
  }

  public ProductOfferingPriceCreate popRelationship(List<ProductOfferingPriceRelationship> popRelationship) {
    this.popRelationship = popRelationship;
    return this;
  }

  public ProductOfferingPriceCreate addPopRelationshipItem(ProductOfferingPriceRelationship popRelationshipItem) {
    if (this.popRelationship == null) {
      this.popRelationship = new ArrayList<ProductOfferingPriceRelationship>();
    }
    this.popRelationship.add(popRelationshipItem);
    return this;
  }

  /**
   * Product Offering Prices related to this Product Offering Price, for example a price alteration such as allowance or discount
   * @return popRelationship
   **/
  @Schema(description = "Product Offering Prices related to this Product Offering Price, for example a price alteration such as allowance or discount")
      @Valid
    public List<ProductOfferingPriceRelationship> getPopRelationship() {
    return popRelationship;
  }

  public void setPopRelationship(List<ProductOfferingPriceRelationship> popRelationship) {
    this.popRelationship = popRelationship;
  }

  public ProductOfferingPriceCreate price(Money price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    @Valid
    public Money getPrice() {
    return price;
  }

  public void setPrice(Money price) {
    this.price = price;
  }

  public ProductOfferingPriceCreate pricingLogicAlgorithm(List<PricingLogicAlgorithm> pricingLogicAlgorithm) {
    this.pricingLogicAlgorithm = pricingLogicAlgorithm;
    return this;
  }

  public ProductOfferingPriceCreate addPricingLogicAlgorithmItem(PricingLogicAlgorithm pricingLogicAlgorithmItem) {
    if (this.pricingLogicAlgorithm == null) {
      this.pricingLogicAlgorithm = new ArrayList<PricingLogicAlgorithm>();
    }
    this.pricingLogicAlgorithm.add(pricingLogicAlgorithmItem);
    return this;
  }

  /**
   * The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled behavior in SID). Some of the parameters of the interface definition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth).
   * @return pricingLogicAlgorithm
   **/
  @Schema(description = "The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled behavior in SID). Some of the parameters of the interface definition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth).")
      @Valid
    public List<PricingLogicAlgorithm> getPricingLogicAlgorithm() {
    return pricingLogicAlgorithm;
  }

  public void setPricingLogicAlgorithm(List<PricingLogicAlgorithm> pricingLogicAlgorithm) {
    this.pricingLogicAlgorithm = pricingLogicAlgorithm;
  }

  public ProductOfferingPriceCreate prodSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
    return this;
  }

  public ProductOfferingPriceCreate addProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUse prodSpecCharValueUseItem) {
    if (this.prodSpecCharValueUse == null) {
      this.prodSpecCharValueUse = new ArrayList<ProductSpecificationCharacteristicValueUse>();
    }
    this.prodSpecCharValueUse.add(prodSpecCharValueUseItem);
    return this;
  }

  /**
   * A use of the ProductSpecificationCharacteristicValue by a ProductOfferingPrice to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering and ProcuctOfferingPrice level. The list of values in ProductSpecificationCharacteristicValueUse is a strict subset of the list of values as defined in the corresponding product specification characteristics.
   * @return prodSpecCharValueUse
   **/
  @Schema(description = "A use of the ProductSpecificationCharacteristicValue by a ProductOfferingPrice to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering and ProcuctOfferingPrice level. The list of values in ProductSpecificationCharacteristicValueUse is a strict subset of the list of values as defined in the corresponding product specification characteristics.")
      @Valid
    public List<ProductSpecificationCharacteristicValueUse> getProdSpecCharValueUse() {
    return prodSpecCharValueUse;
  }

  public void setProdSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
  }

  public ProductOfferingPriceCreate productOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  public ProductOfferingPriceCreate addProductOfferingTermItem(ProductOfferingTerm productOfferingTermItem) {
    if (this.productOfferingTerm == null) {
      this.productOfferingTerm = new ArrayList<ProductOfferingTerm>();
    }
    this.productOfferingTerm.add(productOfferingTermItem);
    return this;
  }

  /**
   * A list of conditions under which a ProductOfferingPrice is made available to Customers. For instance, a Product Offering Price can be offered with multiple commitment periods.
   * @return productOfferingTerm
   **/
  @Schema(description = "A list of conditions under which a ProductOfferingPrice is made available to Customers. For instance, a Product Offering Price can be offered with multiple commitment periods.")
      @Valid
    public List<ProductOfferingTerm> getProductOfferingTerm() {
    return productOfferingTerm;
  }

  public void setProductOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }

  public ProductOfferingPriceCreate tax(List<TaxItem> tax) {
    this.tax = tax;
    return this;
  }

  public ProductOfferingPriceCreate addTaxItem(TaxItem taxItem) {
    if (this.tax == null) {
      this.tax = new ArrayList<TaxItem>();
    }
    this.tax.add(taxItem);
    return this;
  }

  /**
   * An amount of money levied on the price of a Product by a legislative body.
   * @return tax
   **/
  @Schema(description = "An amount of money levied on the price of a Product by a legislative body.")
      @Valid
    public List<TaxItem> getTax() {
    return tax;
  }

  public void setTax(List<TaxItem> tax) {
    this.tax = tax;
  }

  public ProductOfferingPriceCreate unitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Get unitOfMeasure
   * @return unitOfMeasure
   **/
  @Schema(description = "")
  
    @Valid
    public Quantity getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public ProductOfferingPriceCreate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   **/
  @Schema(description = "")
  
    @Valid
    public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductOfferingPriceCreate _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * the immediate base class type of this product offering
   * @return _atBaseType
   **/
  @Schema(description = "the immediate base class type of this product offering")
  
    public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public ProductOfferingPriceCreate _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * hyperlink reference to the schema describing this resource
   * @return _atSchemaLocation
   **/
  @Schema(description = "hyperlink reference to the schema describing this resource")
  
    public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public ProductOfferingPriceCreate _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * The class type of this Product offering
   * @return _atType
   **/
  @Schema(description = "The class type of this Product offering")
  
    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingPriceCreate productOfferingPriceCreate = (ProductOfferingPriceCreate) o;
    return Objects.equals(this.description, productOfferingPriceCreate.description) &&
        Objects.equals(this.isBundle, productOfferingPriceCreate.isBundle) &&
        Objects.equals(this.lastUpdate, productOfferingPriceCreate.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOfferingPriceCreate.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingPriceCreate.name) &&
        Objects.equals(this.percentage, productOfferingPriceCreate.percentage) &&
        Objects.equals(this.priceType, productOfferingPriceCreate.priceType) &&
        Objects.equals(this.recurringChargePeriodLength, productOfferingPriceCreate.recurringChargePeriodLength) &&
        Objects.equals(this.recurringChargePeriodType, productOfferingPriceCreate.recurringChargePeriodType) &&
        Objects.equals(this.version, productOfferingPriceCreate.version) &&
        Objects.equals(this.bundledPopRelationship, productOfferingPriceCreate.bundledPopRelationship) &&
        Objects.equals(this.constraint, productOfferingPriceCreate.constraint) &&
        Objects.equals(this.place, productOfferingPriceCreate.place) &&
        Objects.equals(this.popRelationship, productOfferingPriceCreate.popRelationship) &&
        Objects.equals(this.price, productOfferingPriceCreate.price) &&
        Objects.equals(this.pricingLogicAlgorithm, productOfferingPriceCreate.pricingLogicAlgorithm) &&
        Objects.equals(this.prodSpecCharValueUse, productOfferingPriceCreate.prodSpecCharValueUse) &&
        Objects.equals(this.productOfferingTerm, productOfferingPriceCreate.productOfferingTerm) &&
        Objects.equals(this.tax, productOfferingPriceCreate.tax) &&
        Objects.equals(this.unitOfMeasure, productOfferingPriceCreate.unitOfMeasure) &&
        Objects.equals(this.validFor, productOfferingPriceCreate.validFor) &&
        Objects.equals(this._atBaseType, productOfferingPriceCreate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, productOfferingPriceCreate._atSchemaLocation) &&
        Objects.equals(this._atType, productOfferingPriceCreate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isBundle, lastUpdate, lifecycleStatus, name, percentage, priceType, recurringChargePeriodLength, recurringChargePeriodType, version, bundledPopRelationship, constraint, place, popRelationship, price, pricingLogicAlgorithm, prodSpecCharValueUse, productOfferingTerm, tax, unitOfMeasure, validFor, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceCreate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriodLength: ").append(toIndentedString(recurringChargePeriodLength)).append("\n");
    sb.append("    recurringChargePeriodType: ").append(toIndentedString(recurringChargePeriodType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    bundledPopRelationship: ").append(toIndentedString(bundledPopRelationship)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    popRelationship: ").append(toIndentedString(popRelationship)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricingLogicAlgorithm: ").append(toIndentedString(pricingLogicAlgorithm)).append("\n");
    sb.append("    prodSpecCharValueUse: ").append(toIndentedString(prodSpecCharValueUse)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
