package pl.pjatk.demo;

import org.springframework.data.jpa.repository.*;

interface HumanRepository extends JpaRepository<Human, Long> {


}
