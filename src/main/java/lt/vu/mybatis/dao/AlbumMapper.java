package lt.vu.mybatis.dao;

import lt.vu.mybatis.model.Album;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface AlbumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue Apr 13 13:12:35 EEST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue Apr 13 13:12:35 EEST 2021
     */
    int insert(Album record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue Apr 13 13:12:35 EEST 2021
     */
    Album selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue Apr 13 13:12:35 EEST 2021
     */
    List<Album> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ALBUM
     *
     * @mbg.generated Tue Apr 13 13:12:35 EEST 2021
     */
    int updateByPrimaryKey(Album record);
}