package mz.org.fgh.cmmv.backend.protection

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional


@Service(SecRole)
interface ISecRoleService {

    SecRole get(Serializable id)

    List<SecRole> list(Map args)

    Long count()

    SecRole delete(Serializable id)

    SecRole save(SecRole secRole)

    SecRole getSecRoleByAuthority(String authority)
}
