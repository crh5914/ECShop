package scut.csunion.ecshop.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scut.csunion.ecshop.Model.Entity.OrderEntity;

/**
 * Created by zijun on 16-11-24.
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
}
