package ua.lviv.iot;

import ua.lviv.iot.view.MyView;

public class Main {


    public static void main(final String[] args) throws Exception {
        try {
            new MyView().show();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
//        final Session session = getSession();
//        try {

//            Query query = session.createQuery("FROM " + "ClientEntity");
//            System.out.format("\nTable Client --------------------\n");
//            System.out.format("%3s %-12s %-12s %-13s %s\n", "ID", "Name", "Surname", "Phone", "Address");
//            for (Object obj : query.list()) {
//                ClientEntity person = (ClientEntity) obj;
//                System.out.format("%3d %-12s %-12s %-13s %s\n", person.getId(),
//                        person.getName(), person.getSurname(), person.getPhone(), person.getAddress());
//            }
//
//            query = session.createQuery("FROM " + "OrderEntity");
//            System.out.format("\nTable Order --------------------\n");
//            for (Object obj : query.list()) {
//                OrderEntity orderEntity = (OrderEntity) obj;
//                System.out.format(
//                        "%3d %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %s\n",
//                        orderEntity.getId(), orderEntity.getFromDepartmentId(), orderEntity.getToDepartmentId(),
//                        orderEntity.getFromOperatorId(), orderEntity.getToOperatorId(), orderEntity.getFromCourierId(),
//                        orderEntity.getToCourierId(), orderEntity.getFromClientId(), orderEntity.getToClientId(),
//                        orderEntity.getDeliveryPrice(), orderEntity.getProductPrice(), orderEntity.getWeight(),
//                        orderEntity.getSendingDate(), orderEntity.getApproximateArrivalDate(),
//                        orderEntity.getFixedArrivalDate());
//            }

//            System.out.println("querying all the managed entities...");
//            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
//            for (EntityType<?> entityType : metamodel.getEntities()) {
//                final String entityName = entityType.getName();
//                final Query query = session.createQuery("from " + entityName);
//                System.out.println("executing: " + query.getQueryString());
//                for (Object o : query.list()) {
//                    System.out.println("  " + o);
//                }
//            }
//        } finally {
//            session.close();
//        }
//    }
}
