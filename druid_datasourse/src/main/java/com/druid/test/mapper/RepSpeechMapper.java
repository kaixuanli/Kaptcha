package com.druid.test.mapper;

import com.druid.test.abstracts.SpeechConditionVO;
import com.druid.test.beans.RepSpeech;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @author innodev java team
 * @version 1.0
 * @date 2019/02/26 16:02
 * @since 1.8
 */
@Repository
@Mapper
public interface RepSpeechMapper {

    List<RepSpeech> findPageBreakByCondition(SpeechConditionVO vo);

}
