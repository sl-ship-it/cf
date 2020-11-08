package com.currencyfair.codechallenge.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Error
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T08:41:09.652Z[GMT]")


public class Error   {
  @JsonProperty("reasonText")
  private String reasonText = null;

  public Error reasonText(String reasonText) {
    this.reasonText = reasonText;
    return this;
  }

  /**
   * Get reasonText
   * @return reasonText
   **/
  @Schema(description = "")
  
    public String getReasonText() {
    return reasonText;
  }

  public void setReasonText(String reasonText) {
    this.reasonText = reasonText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.reasonText, error.reasonText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    reasonText: ").append(toIndentedString(reasonText)).append("\n");
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
