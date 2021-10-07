package builder;

import java.time.LocalDate;

public class OrderInfoDto {
    private String clientInfo;
    private String orderDescr;
    private LocalDate deliveryDate;

    public OrderInfoDto(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    public static OrderInfoDtoBuilder builder(String clientInfo){
        return new OrderInfoDtoBuilder(clientInfo);
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
