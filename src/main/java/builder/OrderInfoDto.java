package builder;

import java.time.LocalDate;

public class OrderInfoDto {
    private String clientInfo;
    private String orderDescr;
    private LocalDate deliveryDate;

    public OrderInfoDto(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    public OrderInfoDto(String clientInfo, String orderDescr, LocalDate deliveryDate) {
        this.clientInfo = clientInfo;
        this.orderDescr = orderDescr;
        this.deliveryDate = deliveryDate;
    }

    public static OrderInfoDtoBuilder builder(String clientInfo){
        return new OrderInfoDtoBuilder(clientInfo);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new OrderInfoDto(clientInfo,orderDescr,deliveryDate);
    }

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    public String getOrderDescr() {
        return orderDescr;
    }

    public void setOrderDescr(String orderDescr) {
        this.orderDescr = orderDescr;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("orderInfo {");
        sb.append(clientInfo).append(", ")
                .append(orderDescr).append(", ")
                .append(deliveryDate).append("} ");
        return sb.toString();
    }

    public static class OrderInfoDtoBuilder {
        private final OrderInfoDto orderInfoDto;

        private OrderInfoDtoBuilder(String clientInfo){
            orderInfoDto = new OrderInfoDto(clientInfo);
        }

        public OrderInfoDtoBuilder withOrderDescr(String orderDescr) {
            orderInfoDto.orderDescr = orderDescr;
            return this;
        }
        public OrderInfoDto build(){return orderInfoDto;}
    }
}
