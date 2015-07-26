CREATE TABLE appointment
(
  id VARCHAR(32) PRIMARY KEY NOT NULL,
  appointmentName VARCHAR(50) NOT NULL,
  contractWay INT NOT NULL,
  appointmentTime DATE NOT NULL,
  submitTime DATE NOT NULL,
  finishedTime DATE,
  flag INT NOT NULL
);
CREATE TABLE attention
(
  id VARCHAR(32) PRIMARY KEY NOT NULL,
  investorId VARCHAR(32) NOT NULL,
  companyId VARCHAR(32) NOT NULL,
  attentionState INT NOT NULL,
  stockCreditorId VARCHAR(32) NOT NULL,
  productType INT NOT NULL,
  flag INT NOT NULL,
  userId VARCHAR(32) NOT NULL,
  attStockCreditorId VARCHAR(32) NOT NULL,
  attCompanyId VARCHAR(32) NOT NULL
);
CREATE TABLE company
(
  companyId VARCHAR(32) PRIMARY KEY NOT NULL,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  companyCode VARCHAR(9) NOT NULL,
  companyName VARCHAR(50) NOT NULL,
  companyType INT,
  registerCapital INT,
  businessLisence VARCHAR(50),
  legalPresentative VARCHAR(50),
  formedTime VARCHAR(50),
  officialWeb VARCHAR(50),
  baseAddress VARCHAR(50),
  registerAddress VARCHAR(50),
  consultPhone VARCHAR(20),
  workingFiled VARCHAR(50),
  majorAffair VARCHAR(50),
  revenueModels INT,
  teamDescription VARCHAR(50),
  logo VARCHAR(255),
  companyPicture VARCHAR(0),
  bussinessConcept VARCHAR(100),
  scale VARCHAR(50),
  occupiedArea DOUBLE(20,0),
  guarantor VARCHAR(20),
  patentsHonors VARCHAR(100),
  subdividedIndustry VARCHAR(100),
  productService VARCHAR(100),
  relatedOrganization VARCHAR(100),
  technologicalAdvantage VARCHAR(100),
  productAdvantage VARCHAR(100),
  marketAdvantage VARCHAR(100),
  industryOverview VARCHAR(100),
  developmentStrategy VARCHAR(100),
  financingDemand VARCHAR(10),
  companyInTroduct VARCHAR(255)
);
CREATE TABLE contract
(
  id VARCHAR(32) PRIMARY KEY NOT NULL,
  signTime DATETIME NOT NULL,
  firstId VARCHAR(32) NOT NULL,
  secondId VARCHAR(32) NOT NULL,
  firstName VARCHAR(50) NOT NULL,
  secondName VARCHAR(50) NOT NULL,
  path VARCHAR(50) NOT NULL,
  stockCreditorId VARCHAR(32) NOT NULL,
  state INT NOT NULL
);
CREATE TABLE financedata
(
  id VARCHAR(32) PRIMARY KEY NOT NULL,
  companyId VARCHAR(32) NOT NULL,
  totalAsset INT NOT NULL,
  averTotalAsset INT NOT NULL,
  flowAsset INT NOT NULL,
  sellIncome INT NOT NULL,
  bussinessCost INT NOT NULL,
  majorBussinessIncome INT NOT NULL,
  finalReceivables INT NOT NULL,
  totalDebt INT NOT NULL,
  ownerEquity INT NOT NULL,
  flowDebt INT NOT NULL,
  currentSaleIncome INT NOT NULL,
  currentRevenue INT NOT NULL,
  preReceivables INT NOT NULL,
  profit INT NOT NULL
);
CREATE TABLE information
(
  id VARCHAR(32) PRIMARY KEY NOT NULL,
  flag INT NOT NULL,
  fileName VARCHAR(50) NOT NULL,
  path VARCHAR(255) NOT NULL,
  investorId VARCHAR(32)
);
CREATE TABLE investor
(
  investorId VARCHAR(32) PRIMARY KEY NOT NULL,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  consultPhone VARCHAR(20),
  investorName VARCHAR(20),
  baseAddress VARCHAR(50),
  fundBody INT,
  companyName VARCHAR(50) NOT NULL,
  address VARCHAR(50),
  registeredCapital INT,
  legalRepresentative VARCHAR(50),
  legalRepresentativeMandator VARCHAR(50),
  companyScale VARCHAR(50),
  totalMoney INT,
  companyCode VARCHAR(9) NOT NULL,
  contactWay VARCHAR(50),
  companyArea VARCHAR(50),
  investArea VARCHAR(50),
  investField VARCHAR(50),
  investStage VARCHAR(18),
  investPeriod VARCHAR(50),
  investIndustry VARCHAR(50),
  investMoney INT,
  investType VARCHAR(50),
  material VARCHAR(50),
  investHistory VARCHAR(50),
  successCase VARCHAR(50),
  investPreference INT,
  shareholderBackground VARCHAR(50),
  managedFund VARCHAR(50),
  logoPath VARCHAR(255)
);
CREATE TABLE message
(
  id VARCHAR(32) PRIMARY KEY NOT NULL,
  time DATE NOT NULL,
  content VARCHAR(255) NOT NULL,
  investorId VARCHAR(32),
  companyId VARCHAR(32),
  flag INT NOT NULL,
  status INT
);
CREATE TABLE stockcreditor
(
  id VARCHAR(32) NOT NULL,
  productName VARCHAR(255) NOT NULL,
  investorId VARCHAR(32) NOT NULL,
  investArea VARCHAR(50) NOT NULL,
  investIndustry VARCHAR(50) NOT NULL,
  createTime DATE NOT NULL,
  investMoney INT NOT NULL,
  investTime INT NOT NULL,
  productType INT NOT NULL,
  stockRate VARCHAR(50),
  investStage VARCHAR(50),
  leastReturnDemand VARCHAR(50),
  riskControlDemand INT,
  demandFile VARCHAR(50),
  demandSummarize VARCHAR(50),
  creditRank INT,
  flag INT NOT NULL,
  userId VARCHAR(32) NOT NULL
);
ALTER TABLE message ADD FOREIGN KEY (companyId) REFERENCES company (companyId);
ALTER TABLE message ADD FOREIGN KEY (investorId) REFERENCES investor (investorId);
CREATE INDEX mesCompanyId ON message (companyId);
CREATE INDEX mesInvestorId ON message (investorId);
