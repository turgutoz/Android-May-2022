package com.borasahin.android.library.geonames.postalcode.data.service

import com.borasahin.android.library.geonames.postalcode.data.service.dto.PostalCodeDTO
import com.karandev.util.data.service.DataServiceException

internal data class FindPostalCodeByCodeResultHandlerObject(var result: MutableIterable<PostalCodeDTO>,
                                                            var resultBlock: (MutableIterable<PostalCodeDTO>) -> Unit)