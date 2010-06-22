# LOADS A SALESFORCE ACCOUNT DATA

# CREATE A NEW PROJECT
CreateProject(name="SFDC");

# LOADS A NEW TIME DIMENSION TO THE PROJECT
LoadTimeDimension(context="Created");

# GENERATE THE TIME DIMENSION MAQL
GenerateMaql(maqlFile="examples/sfdc/created.maql");

# EXECUTE THE TIME DIMENSION MAQL
# DATA FOR THE TIME DIMENSION ARE GENERATED AUTOMATICALLY BY GOOD DATA
# NO DATA TRANSFER IS NECESSARY FOR TIME DIMENSIONS
ExecuteMaql(maqlFile="examples/sfdc/created.maql");

# LOADS A NEW TIME DIMENSION TO THE PROJECT
LoadTimeDimension(context="Closed");

# GENERATE THE TIME DIMENSION MAQL
GenerateMaql(maqlFile="examples/sfdc/closed.maql");

# EXECUTE THE TIME DIMENSION MAQL
# DATA FOR THE TIME DIMENSION ARE GENERATED AUTOMATICALLY BY GOOD DATA
# NO DATA TRANSFER IS NECESSARY FOR TIME DIMENSIONS
ExecuteMaql(maqlFile="examples/sfdc/closed.maql");

# LOAD THE ACCOUNT
LoadSfdc(configFile="examples/sfdc/account.xml",username="mh@gooddata.blank",password="8uEx6ddzkrTClAQjzY2DbsucCCiNPXNvRx",query="SELECT Id, Name FROM Account");

# GENERATE THE ACCOUNT MAQL
GenerateMaql(maqlFile="examples/sfdc/account.maql");

# EXECUTE THE ACCOUNT MAQL
ExecuteMaql(maqlFile="examples/sfdc/account.maql");

# TRANSFER THE ACCOUNT DATA
TransferLastSnapshot(incremental="true");

# GENERATE THE OPPORTUNITY CONFIG
#GenerateSfdcConfig(name="Opportunity", configFile="examples/sfdc/opportunity.xml",username="mh@gooddata.blank",password="8uEx6ddzkrTClAQjzY2DbsucCCiNPXNvRx",query="SELECT Id, AccountId, IsWon, IsClosed, CloseDate, StageName, CreatedDate, ExpectedRevenue, Amount FROM Opportunity");

# LOAD THE OPPORTUNITY
LoadSfdc(configFile="examples/sfdc/opportunity.xml",username="mh@gooddata.blank",password="8uEx6ddzkrTClAQjzY2DbsucCCiNPXNvRx",query="SELECT Id, AccountId, IsWon, IsClosed, CloseDate, StageName, CreatedDate, ExpectedRevenue, Amount FROM Opportunity");

# GENERATE THE OPPORTUNITY MAQL
GenerateMaql(maqlFile="examples/sfdc/opportunity.maql");

# EXECUTE THE OPPORTUNITY MAQL
ExecuteMaql(maqlFile="examples/sfdc/opportunity.maql");

# TRANSFER THE OPPORTUNITY DATA
TransferLastSnapshot(incremental="true");