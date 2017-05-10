package cn.edu.tju.tiei.eshop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private Integer id;

    private String customerId;

    private Integer statusId;

    private BigDecimal price;

    private Integer paymentMethodId;

    private Integer sendMethodId;

    private Date placeTime;

    private Date sendTime;

    private String invoiceTitle;

    private String invoiceItem;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Integer getSendMethodId() {
        return sendMethodId;
    }

    public void setSendMethodId(Integer sendMethodId) {
        this.sendMethodId = sendMethodId;
    }

    public Date getPlaceTime() {
        return placeTime;
    }

    public void setPlaceTime(Date placeTime) {
        this.placeTime = placeTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(String invoiceItem) {
        this.invoiceItem = invoiceItem == null ? null : invoiceItem.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getStatusId() == null ? other.getStatusId() == null : this.getStatusId().equals(other.getStatusId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPaymentMethodId() == null ? other.getPaymentMethodId() == null : this.getPaymentMethodId().equals(other.getPaymentMethodId()))
            && (this.getSendMethodId() == null ? other.getSendMethodId() == null : this.getSendMethodId().equals(other.getSendMethodId()))
            && (this.getPlaceTime() == null ? other.getPlaceTime() == null : this.getPlaceTime().equals(other.getPlaceTime()))
            && (this.getSendTime() == null ? other.getSendTime() == null : this.getSendTime().equals(other.getSendTime()))
            && (this.getInvoiceTitle() == null ? other.getInvoiceTitle() == null : this.getInvoiceTitle().equals(other.getInvoiceTitle()))
            && (this.getInvoiceItem() == null ? other.getInvoiceItem() == null : this.getInvoiceItem().equals(other.getInvoiceItem()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getStatusId() == null) ? 0 : getStatusId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPaymentMethodId() == null) ? 0 : getPaymentMethodId().hashCode());
        result = prime * result + ((getSendMethodId() == null) ? 0 : getSendMethodId().hashCode());
        result = prime * result + ((getPlaceTime() == null) ? 0 : getPlaceTime().hashCode());
        result = prime * result + ((getSendTime() == null) ? 0 : getSendTime().hashCode());
        result = prime * result + ((getInvoiceTitle() == null) ? 0 : getInvoiceTitle().hashCode());
        result = prime * result + ((getInvoiceItem() == null) ? 0 : getInvoiceItem().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerId=").append(customerId);
        sb.append(", statusId=").append(statusId);
        sb.append(", price=").append(price);
        sb.append(", paymentMethodId=").append(paymentMethodId);
        sb.append(", sendMethodId=").append(sendMethodId);
        sb.append(", placeTime=").append(placeTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", invoiceTitle=").append(invoiceTitle);
        sb.append(", invoiceItem=").append(invoiceItem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}