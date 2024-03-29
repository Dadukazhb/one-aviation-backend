package com.naltynbekkz.oneaviation.ticket

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TicketRepository : JpaRepository<TicketEntity, Long>