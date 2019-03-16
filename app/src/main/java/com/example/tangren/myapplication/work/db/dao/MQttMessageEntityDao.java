package com.example.tangren.myapplication.work.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.tangren.myapplication.work.entity.MQttMessageEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MQTT_MESSAGE_ENTITY".
*/
public class MQttMessageEntityDao extends AbstractDao<MQttMessageEntity, Long> {

    public static final String TABLENAME = "MQTT_MESSAGE_ENTITY";

    /**
     * Properties of entity MQttMessageEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Url = new Property(1, String.class, "url", false, "URL");
        public final static Property SubKind = new Property(2, String.class, "subKind", false, "SUB_KIND");
        public final static Property SubTime = new Property(3, String.class, "subTime", false, "SUB_TIME");
        public final static Property FilePath = new Property(4, String.class, "filePath", false, "FILE_PATH");
        public final static Property FileName = new Property(5, String.class, "fileName", false, "FILE_NAME");
        public final static Property FileVersion = new Property(6, String.class, "fileVersion", false, "FILE_VERSION");
        public final static Property FileCheckMode = new Property(7, String.class, "fileCheckMode", false, "FILE_CHECK_MODE");
        public final static Property FileCheckCode = new Property(8, String.class, "fileCheckCode", false, "FILE_CHECK_CODE");
        public final static Property Token = new Property(9, String.class, "token", false, "TOKEN");
        public final static Property TokenExTime = new Property(10, String.class, "tokenExTime", false, "TOKEN_EX_TIME");
        public final static Property AccessKeyId = new Property(11, String.class, "accessKeyId", false, "ACCESS_KEY_ID");
        public final static Property AccessKeySercet = new Property(12, String.class, "accessKeySercet", false, "ACCESS_KEY_SERCET");
        public final static Property Endpoint = new Property(13, String.class, "endpoint", false, "ENDPOINT");
        public final static Property BucketName = new Property(14, String.class, "bucketName", false, "BUCKET_NAME");
        public final static Property VehicleID = new Property(15, String.class, "vehicleID", false, "VEHICLE_ID");
        public final static Property FileFolder = new Property(16, String.class, "fileFolder", false, "FILE_FOLDER");
        public final static Property Filename = new Property(17, String.class, "filename", false, "FILENAME");
        public final static Property DownloadPosition = new Property(18, long.class, "downloadPosition", false, "DOWNLOAD_POSITION");
        public final static Property MaxPosition = new Property(19, long.class, "maxPosition", false, "MAX_POSITION");
        public final static Property IsReTry = new Property(20, boolean.class, "isReTry", false, "IS_RE_TRY");
        public final static Property ProcessResult = new Property(21, String.class, "processResult", false, "PROCESS_RESULT");
        public final static Property ProcessMsg = new Property(22, String.class, "processMsg", false, "PROCESS_MSG");
        public final static Property TaskId = new Property(23, String.class, "taskId", false, "TASK_ID");
        public final static Property Reserve_1 = new Property(24, String.class, "reserve_1", false, "RESERVE_1");
        public final static Property Reserve_2 = new Property(25, String.class, "reserve_2", false, "RESERVE_2");
        public final static Property Reserve_3 = new Property(26, String.class, "reserve_3", false, "RESERVE_3");
    }


    public MQttMessageEntityDao(DaoConfig config) {
        super(config);
    }
    
    public MQttMessageEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MQTT_MESSAGE_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"URL\" TEXT UNIQUE ," + // 1: url
                "\"SUB_KIND\" TEXT," + // 2: subKind
                "\"SUB_TIME\" TEXT," + // 3: subTime
                "\"FILE_PATH\" TEXT," + // 4: filePath
                "\"FILE_NAME\" TEXT," + // 5: fileName
                "\"FILE_VERSION\" TEXT," + // 6: fileVersion
                "\"FILE_CHECK_MODE\" TEXT," + // 7: fileCheckMode
                "\"FILE_CHECK_CODE\" TEXT," + // 8: fileCheckCode
                "\"TOKEN\" TEXT," + // 9: token
                "\"TOKEN_EX_TIME\" TEXT," + // 10: tokenExTime
                "\"ACCESS_KEY_ID\" TEXT," + // 11: accessKeyId
                "\"ACCESS_KEY_SERCET\" TEXT," + // 12: accessKeySercet
                "\"ENDPOINT\" TEXT," + // 13: endpoint
                "\"BUCKET_NAME\" TEXT," + // 14: bucketName
                "\"VEHICLE_ID\" TEXT," + // 15: vehicleID
                "\"FILE_FOLDER\" TEXT," + // 16: fileFolder
                "\"FILENAME\" TEXT," + // 17: filename
                "\"DOWNLOAD_POSITION\" INTEGER NOT NULL ," + // 18: downloadPosition
                "\"MAX_POSITION\" INTEGER NOT NULL ," + // 19: maxPosition
                "\"IS_RE_TRY\" INTEGER NOT NULL ," + // 20: isReTry
                "\"PROCESS_RESULT\" TEXT," + // 21: processResult
                "\"PROCESS_MSG\" TEXT," + // 22: processMsg
                "\"TASK_ID\" TEXT," + // 23: taskId
                "\"RESERVE_1\" TEXT," + // 24: reserve_1
                "\"RESERVE_2\" TEXT," + // 25: reserve_2
                "\"RESERVE_3\" TEXT);"); // 26: reserve_3
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MQTT_MESSAGE_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MQttMessageEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }
 
        String subKind = entity.getSubKind();
        if (subKind != null) {
            stmt.bindString(3, subKind);
        }
 
        String subTime = entity.getSubTime();
        if (subTime != null) {
            stmt.bindString(4, subTime);
        }
 
        String filePath = entity.getFilePath();
        if (filePath != null) {
            stmt.bindString(5, filePath);
        }
 
        String fileName = entity.getFileName();
        if (fileName != null) {
            stmt.bindString(6, fileName);
        }
 
        String fileVersion = entity.getFileVersion();
        if (fileVersion != null) {
            stmt.bindString(7, fileVersion);
        }
 
        String fileCheckMode = entity.getFileCheckMode();
        if (fileCheckMode != null) {
            stmt.bindString(8, fileCheckMode);
        }
 
        String fileCheckCode = entity.getFileCheckCode();
        if (fileCheckCode != null) {
            stmt.bindString(9, fileCheckCode);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(10, token);
        }
 
        String tokenExTime = entity.getTokenExTime();
        if (tokenExTime != null) {
            stmt.bindString(11, tokenExTime);
        }
 
        String accessKeyId = entity.getAccessKeyId();
        if (accessKeyId != null) {
            stmt.bindString(12, accessKeyId);
        }
 
        String accessKeySercet = entity.getAccessKeySercet();
        if (accessKeySercet != null) {
            stmt.bindString(13, accessKeySercet);
        }
 
        String endpoint = entity.getEndpoint();
        if (endpoint != null) {
            stmt.bindString(14, endpoint);
        }
 
        String bucketName = entity.getBucketName();
        if (bucketName != null) {
            stmt.bindString(15, bucketName);
        }
 
        String vehicleID = entity.getVehicleID();
        if (vehicleID != null) {
            stmt.bindString(16, vehicleID);
        }
 
        String fileFolder = entity.getFileFolder();
        if (fileFolder != null) {
            stmt.bindString(17, fileFolder);
        }
 
        String filename = entity.getFilename();
        if (filename != null) {
            stmt.bindString(18, filename);
        }
        stmt.bindLong(19, entity.getDownloadPosition());
        stmt.bindLong(20, entity.getMaxPosition());
        stmt.bindLong(21, entity.getIsReTry() ? 1L: 0L);
 
        String processResult = entity.getProcessResult();
        if (processResult != null) {
            stmt.bindString(22, processResult);
        }
 
        String processMsg = entity.getProcessMsg();
        if (processMsg != null) {
            stmt.bindString(23, processMsg);
        }
 
        String taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindString(24, taskId);
        }
 
        String reserve_1 = entity.getReserve_1();
        if (reserve_1 != null) {
            stmt.bindString(25, reserve_1);
        }
 
        String reserve_2 = entity.getReserve_2();
        if (reserve_2 != null) {
            stmt.bindString(26, reserve_2);
        }
 
        String reserve_3 = entity.getReserve_3();
        if (reserve_3 != null) {
            stmt.bindString(27, reserve_3);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MQttMessageEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }
 
        String subKind = entity.getSubKind();
        if (subKind != null) {
            stmt.bindString(3, subKind);
        }
 
        String subTime = entity.getSubTime();
        if (subTime != null) {
            stmt.bindString(4, subTime);
        }
 
        String filePath = entity.getFilePath();
        if (filePath != null) {
            stmt.bindString(5, filePath);
        }
 
        String fileName = entity.getFileName();
        if (fileName != null) {
            stmt.bindString(6, fileName);
        }
 
        String fileVersion = entity.getFileVersion();
        if (fileVersion != null) {
            stmt.bindString(7, fileVersion);
        }
 
        String fileCheckMode = entity.getFileCheckMode();
        if (fileCheckMode != null) {
            stmt.bindString(8, fileCheckMode);
        }
 
        String fileCheckCode = entity.getFileCheckCode();
        if (fileCheckCode != null) {
            stmt.bindString(9, fileCheckCode);
        }
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(10, token);
        }
 
        String tokenExTime = entity.getTokenExTime();
        if (tokenExTime != null) {
            stmt.bindString(11, tokenExTime);
        }
 
        String accessKeyId = entity.getAccessKeyId();
        if (accessKeyId != null) {
            stmt.bindString(12, accessKeyId);
        }
 
        String accessKeySercet = entity.getAccessKeySercet();
        if (accessKeySercet != null) {
            stmt.bindString(13, accessKeySercet);
        }
 
        String endpoint = entity.getEndpoint();
        if (endpoint != null) {
            stmt.bindString(14, endpoint);
        }
 
        String bucketName = entity.getBucketName();
        if (bucketName != null) {
            stmt.bindString(15, bucketName);
        }
 
        String vehicleID = entity.getVehicleID();
        if (vehicleID != null) {
            stmt.bindString(16, vehicleID);
        }
 
        String fileFolder = entity.getFileFolder();
        if (fileFolder != null) {
            stmt.bindString(17, fileFolder);
        }
 
        String filename = entity.getFilename();
        if (filename != null) {
            stmt.bindString(18, filename);
        }
        stmt.bindLong(19, entity.getDownloadPosition());
        stmt.bindLong(20, entity.getMaxPosition());
        stmt.bindLong(21, entity.getIsReTry() ? 1L: 0L);
 
        String processResult = entity.getProcessResult();
        if (processResult != null) {
            stmt.bindString(22, processResult);
        }
 
        String processMsg = entity.getProcessMsg();
        if (processMsg != null) {
            stmt.bindString(23, processMsg);
        }
 
        String taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindString(24, taskId);
        }
 
        String reserve_1 = entity.getReserve_1();
        if (reserve_1 != null) {
            stmt.bindString(25, reserve_1);
        }
 
        String reserve_2 = entity.getReserve_2();
        if (reserve_2 != null) {
            stmt.bindString(26, reserve_2);
        }
 
        String reserve_3 = entity.getReserve_3();
        if (reserve_3 != null) {
            stmt.bindString(27, reserve_3);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MQttMessageEntity readEntity(Cursor cursor, int offset) {
        MQttMessageEntity entity = new MQttMessageEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // url
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // subKind
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // subTime
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // filePath
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // fileName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // fileVersion
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // fileCheckMode
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // fileCheckCode
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // token
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // tokenExTime
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // accessKeyId
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // accessKeySercet
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // endpoint
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // bucketName
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // vehicleID
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // fileFolder
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // filename
            cursor.getLong(offset + 18), // downloadPosition
            cursor.getLong(offset + 19), // maxPosition
            cursor.getShort(offset + 20) != 0, // isReTry
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // processResult
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // processMsg
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // taskId
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // reserve_1
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // reserve_2
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26) // reserve_3
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MQttMessageEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUrl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSubKind(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSubTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFilePath(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFileName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFileVersion(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFileCheckMode(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setFileCheckCode(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setToken(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setTokenExTime(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setAccessKeyId(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setAccessKeySercet(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setEndpoint(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setBucketName(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setVehicleID(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setFileFolder(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setFilename(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setDownloadPosition(cursor.getLong(offset + 18));
        entity.setMaxPosition(cursor.getLong(offset + 19));
        entity.setIsReTry(cursor.getShort(offset + 20) != 0);
        entity.setProcessResult(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setProcessMsg(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setTaskId(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setReserve_1(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setReserve_2(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setReserve_3(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MQttMessageEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MQttMessageEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MQttMessageEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
