--liquibase formatted sql
--changeset d.ramirez.ledesma:ABMS_TPL_BATCH_INBOUND.sql

INSERT INTO &&1..BATCH_JOB
  (
    NAME,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON,
    COUNTY_CODE
  )
  VALUES
  (
    'PI00C33100',
    'CssDev',
    'CssDev',
    SYSDATE,
    SYSDATE,
    '00'
  );
  
 INSERT INTO &&1..batch_module
  (
    batch_job_id,
    name,
    summ_stat_ind,
    created_by,
    updated_by,
    created_on,
    updated_on
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name='PI00C33100'),
    'Reader',
    'Y',
    'CssDev',
    'CssDev',
    SYSDATE,
    SYSDATE
  );
  
 INSERT INTO &&1..batch_prop
  (
    NAME,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON      
  )
  VALUES
  (
    'Reader',
    'CssDev',
    'CssDev',
     SYSDATE,
     SYSDATE       
  );
  
  INSERT INTO &&1..batch_prop
  (
    NAME,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON    
  )
  VALUES
  (
    'Reader',
    'CssDev',
    'CssDev',
     SYSDATE,
     SYSDATE     
  );
  
  INSERT INTO &&1..COMMON_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON     
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name = 'PI00C33100' ),
    (SELECT id FROM batch_prop WHERE name = 'Module1' ),
    'Reader',
    'CssDev',
    'CssDev',
     SYSDATE,
     SYSDATE     
  );
  
  INSERT INTO &&1..COMMON_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON  
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name = 'PI00C33100') ,
    (SELECT id  FROM batch_prop  WHERE name = 'Reader' ),
    'ReaderDefinition.xml',
    'CssDev',
    'CssDev',
     SYSDATE,
     SYSDATE    
  );
  
  INSERT
INTO &&1..COMMON_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON    
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name = 'PI00C33100'),
    (SELECT id FROM batch_prop WHERE name = 'logName'),
    'Reader',
    'CssDev',
    'CssDev',
     SYSDATE,
     SYSDATE
  );
  
  INSERT
INTO &&1..COMMON_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name ='PI00C33100'),
    (SELECT id FROM batch_prop WHERE name ='localFileSystemIndicator'),
    'true',
    'CssDev',
    'CssDev',
    SYSDATE,
    SYSDATE
  ); 
  
  INSERT INTO
  &&1..COMMON_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON
  )
  VALUES
  (
    (SELECT ID FROM BATCH_JOB WHERE name = 'PI00C33100'),
    (SELECT id FROM batch_prop WHERE name ='commitFrequency'),
    500,
    'CssDev',
    'CssDev',
    SYSDATE,
    SYSDATE
  ); 
  
 INSERT INTO &&1..TEST_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON    
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name = 'PI00C33100'),
    (SELECT id FROM batch_prop WHERE name = 'Reader' ),
    'TST.SSA.STATE.TPL',
    'CssDev',
    'CssDev',
     SYSDATE,
     SYSDATE
  );
  
  INSERT
INTO &&1..TEST_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name = 'PI00C33100') ,
    (SELECT id FROM batch_prop WHERE name = 'countyCode'),
    '00',
    'CssDev',
    'CssDev',
    SYSDATE,
    SYSDATE
  );
  
  INSERT
INTO &&1..PROD_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name = 'PI00C33100') ,
    (SELECT id FROM batch_prop WHERE name = 'Reader'),
    'PRD.SSA',
    'CssDev',
    'CssDev',
    SYSDATE,
    SYSDATE
  );
  
  INSERT
INTO &&1..PROD_BATCH_JOB_PROP
  (
    BATCH_JOB_ID,
    BATCH_PROP_ID,
    VAL,
    CREATED_BY,
    UPDATED_BY,
    CREATED_ON,
    UPDATED_ON
  )
  VALUES
  (
    (SELECT id FROM batch_job WHERE name = 'PI00C33100'),
    (SELECT id FROM batch_prop WHERE name = 'countyCode'),
    '00',
    'CssDev',
    'CssDev',
    SYSDATE,
    SYSDATE
  );
  
  COMMIT;