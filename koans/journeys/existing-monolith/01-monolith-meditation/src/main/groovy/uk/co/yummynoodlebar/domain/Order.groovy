package uk.co.yummynoodlebar.domain

import java.util.*

class Order {

  final Date dateTimeOfSubmission
  Map<String, Integer> orderItems
  final UUID key = UUID.randomUUID()
  Customer customer

  OrderStatus status
  List<OrderStatus> statusHistory = new ArrayList<OrderStatus>()

  def addStatus(OrderStatus newStatus) {
    statusHistory.add(newStatus);
    status = newStatus;
  }

  OrderStatus getStatus() {
    return status;
  }

  def setOrderItems(Map<String, Integer> orderItems) {
    if (orderItems == null) {
      this.orderItems = Collections.emptyMap();
    } else {
      this.orderItems = Collections.unmodifiableMap(orderItems);
    }
  }

  def getOrderItems() {
    return orderItems;
  }

  def canBeDeleted() {
    return true;
  }
}
