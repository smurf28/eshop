package cn.edu.tju.tiei.eshop.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIsNull() {
            addCriterion("payment_method_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIsNotNull() {
            addCriterion("payment_method_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdEqualTo(Integer value) {
            addCriterion("payment_method_id =", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotEqualTo(Integer value) {
            addCriterion("payment_method_id <>", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdGreaterThan(Integer value) {
            addCriterion("payment_method_id >", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_method_id >=", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdLessThan(Integer value) {
            addCriterion("payment_method_id <", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_method_id <=", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIn(List<Integer> values) {
            addCriterion("payment_method_id in", values, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotIn(List<Integer> values) {
            addCriterion("payment_method_id not in", values, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_method_id between", value1, value2, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_method_id not between", value1, value2, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdIsNull() {
            addCriterion("send_method_id is null");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdIsNotNull() {
            addCriterion("send_method_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdEqualTo(Integer value) {
            addCriterion("send_method_id =", value, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdNotEqualTo(Integer value) {
            addCriterion("send_method_id <>", value, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdGreaterThan(Integer value) {
            addCriterion("send_method_id >", value, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_method_id >=", value, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdLessThan(Integer value) {
            addCriterion("send_method_id <", value, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_method_id <=", value, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdIn(List<Integer> values) {
            addCriterion("send_method_id in", values, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdNotIn(List<Integer> values) {
            addCriterion("send_method_id not in", values, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("send_method_id between", value1, value2, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andSendMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_method_id not between", value1, value2, "sendMethodId");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeIsNull() {
            addCriterion("place_time is null");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeIsNotNull() {
            addCriterion("place_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeEqualTo(Date value) {
            addCriterion("place_time =", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeNotEqualTo(Date value) {
            addCriterion("place_time <>", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeGreaterThan(Date value) {
            addCriterion("place_time >", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("place_time >=", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeLessThan(Date value) {
            addCriterion("place_time <", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeLessThanOrEqualTo(Date value) {
            addCriterion("place_time <=", value, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeIn(List<Date> values) {
            addCriterion("place_time in", values, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeNotIn(List<Date> values) {
            addCriterion("place_time not in", values, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeBetween(Date value1, Date value2) {
            addCriterion("place_time between", value1, value2, "placeTime");
            return (Criteria) this;
        }

        public Criteria andPlaceTimeNotBetween(Date value1, Date value2) {
            addCriterion("place_time not between", value1, value2, "placeTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIsNull() {
            addCriterion("invoice_item is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIsNotNull() {
            addCriterion("invoice_item is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemEqualTo(String value) {
            addCriterion("invoice_item =", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemNotEqualTo(String value) {
            addCriterion("invoice_item <>", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemGreaterThan(String value) {
            addCriterion("invoice_item >", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_item >=", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemLessThan(String value) {
            addCriterion("invoice_item <", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemLessThanOrEqualTo(String value) {
            addCriterion("invoice_item <=", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemLike(String value) {
            addCriterion("invoice_item like", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemNotLike(String value) {
            addCriterion("invoice_item not like", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIn(List<String> values) {
            addCriterion("invoice_item in", values, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemNotIn(List<String> values) {
            addCriterion("invoice_item not in", values, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemBetween(String value1, String value2) {
            addCriterion("invoice_item between", value1, value2, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemNotBetween(String value1, String value2) {
            addCriterion("invoice_item not between", value1, value2, "invoiceItem");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}