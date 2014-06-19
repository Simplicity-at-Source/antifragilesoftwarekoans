package com.simplicityitself.examples

@Slf4J
class CountTheConcernsPseudoSampleService {
	
   def dataSource
   def transactionManage

   OrderRepository repository = new JDBCOrderRepository(dataSource)

   def doSomethingCrucialAndSecure(int info) {
	 log.info("Running crucial and secure method")
	 def transaction = transactionManager.createTransaction(dataSource)
	 def securityContext = securityManager.createSecureContext()
	 transaction.withinTransaction {
		securityContext.withinContext {
			def order = repository.find(info)
			order.cancel()
			repository.remove(order)
		}
	 }
	 log.info("Crucial and secure method completed")
   }
}